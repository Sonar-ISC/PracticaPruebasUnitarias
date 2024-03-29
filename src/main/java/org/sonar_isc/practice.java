package org.sonar_isc;

public class practice {

    public static Boolean isApplicable(int age) {
        return age > 14 && age <= 28;
    }

    public static String categorizeGrade(String input) {
        if (input == null || input.trim().isEmpty() || !input.matches("\\d+")) {
            return "Entrada inválida. Por favor, introduce un número válido.";
        }
        int grade = Integer.parseInt(input);
        if (grade < 0 || grade > 100) {
            return "Entrada inválida. La calificación debe estar entre 0 y 100.";
        }

        if (grade >= 90) {
            return "Excelente";
        } else if (grade >= 60) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public static String verifyLogin(String username, String password) {
        if (username.equals("adminUser") && password.equals("adminPass")) {
            return "Admin";
        } else if (username.equals("normalUser") && password.equals("userPass")) {
            return "Usuario";
        } else {
            return "Acceso denegado";
        }
    }

    public static String updateOrderStatus(String currentStatus, String action) {
        switch (currentStatus) {
            case "Pendiente":
                return action.equals("Procesar") ? "En Proceso" : "Pendiente";
            case "En Proceso":
                return action.equals("Enviar") ? "Enviado" : "En Proceso";
            case "Enviado":
                return action.equals("Entregar") ? "Entregado" : "Enviado";
            default:
                return "Entregado";
        }
    }
}
