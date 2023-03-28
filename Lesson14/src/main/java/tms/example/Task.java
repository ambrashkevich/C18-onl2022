// * Необходимо выполнить проверку на валидацию входящей строки и вернуть false или true
//     * - Строка должна содержать только маленькие латинские буквы и цифры 1 или 5 без знака подчеркивания.
//     * - Длина строки должна быть от 4 до 20 символов.
//     *
//     * PS: нужно посмотреть презентацию страница 44 (Метасимволы для группировки символов)
//     *
//     * */

package tms.example;

public class Task {

    public static void main(String[] args) {
        System.out.println(validate("5555azaza5555azazazz"));
        System.out.println(validate("25zaz"));
        System.out.println(validate("15"));
        System.out.println(validate("151.11"));
        System.out.println(validate("azaz"));
        System.out.println(validate("aZz1243213123213213123"));
        System.out.println(validate("1515avaavavavavava"));
        System.out.println(validate("555555555555555555551"));
    }

    private static boolean validate(String string) {
        return string.matches("[a-z.,15]{4,20}"); //{4,20} не менее n раз и не более m раз {n,m}
    }
}
