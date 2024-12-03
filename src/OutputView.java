import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputView {

    // 급여 계산 결과를 파일에 출력하는 메서드
    public void showPayInfos(List<FinalUserPayInfo> finalPayInfos) {
        // 결과가 없으면 출력하지 않음
        if (finalPayInfos == null || finalPayInfos.isEmpty()) {
            System.out.println("출력할 급여 정보가 없습니다.");
            return;
        }

        // 파일에 결과 출력
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("payroll_result.txt"))) {
            for (FinalUserPayInfo finalPayInfo : finalPayInfos) {
                writer.write(finalPayInfo.toString());
                writer.newLine();  // 각 결과를 새로운 줄에 작성
            }
            System.out.println("급여 계산 결과가 파일에 저장되었습니다: payroll_result.txt");
        } catch (IOException e) {
            System.out.println("파일을 작성하는 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}

