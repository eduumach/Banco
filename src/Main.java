class Main {
    public static void main(String[] args) {
        Gerente a = new Gerente();
        SistemaInterno s = new SistemaInterno();
        a.setSenha(1234);
        s.login(a, 1234);
    }
}