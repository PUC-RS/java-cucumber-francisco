package br.masmangan.beecrowd.bee1059;

import static java.lang.System.out;

public final class Main {
    private Main() {
    }
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                out.print(i + "\n");
            }
        }
    }
}


