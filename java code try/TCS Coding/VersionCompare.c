#include <stdio.h>

int getNumber(char *str, int *i) {
    int num = 0;

    while (str[*i] && str[*i] != '.') {
        num = num * 10 + (str[*i] - '0');
        (*i)++;
    }

    // Skip dot ONLY if present
    if (str[*i] == '.')
        (*i)++;

    return num;
}

void compareVersion(char *v1, char *v2) {
    int i = 0, j = 0;

    while (v1[i] || v2[j]) {

        int num1 = v1[i] ? getNumber(v1, &i) : 0;
        int num2 = v2[j] ? getNumber(v2, &j) : 0;

        if (num1 < num2) {
            printf("Upgraded\n");
            return;
        }

        if (num1 > num2) {
            printf("Downgraded\n");
            return;
        }
    }

    printf("Same Version\n");
}

int main() {
    compareVersion("4.8.2", "4.8.4");
    compareVersion("4.0.2", "4.8.4");
    compareVersion("4.8.2", "4.8.2.1");
    return 0;
}