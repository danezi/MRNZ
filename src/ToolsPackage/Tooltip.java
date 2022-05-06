package ToolsPackage;

import java.util.HashMap;

    /**
     * Tooltips gibt mehr Informationen über das Objekt. Tooltips ist ein Fenster,das zeigt eine Beschreibung zu einem Element der
     * grafische Benutzungsoberfläche(hier unsere Karte).
     */
    public abstract class Tooltip
    {
        /**
         * Titel des Tooltips.
         */
        protected String titel1 = null;

        /**
         *Value eines Tooltips sind die genaue Informationen der Karte, die angezeigt werden sollen.
         *Key definiert die Art der Information, und der Wert ist die entsprechende Information.
         * Z.B( Macht die Höhe des Schadens, der während eines Angriffs(Attack) verursacht wird.
         */
         protected HashMap<String, String> values1 = new HashMap<String, String>();

        /**
         * default Konstruktor.
         */
        public Tooltip()
        {

        }

        /**
         * Tooltips liefern Informationen über das Objekt, das sich gerade im Fokus des Spielers ist.
         * @param   titel definiert das Objekt, das der Tooltip beschreibt.
         */
        public Tooltip(String titel)
        {
            this.titel1= titel;
        }

        /**
         *
         * @param titel  definiert das Object, das der Titel definiert das Objekt, das der Tooltip beschreibt.
         * @param values bescreibt das Object.
         */
        public Tooltip (String titel, HashMap<String, String> values)
        {
         this.titel1 = titel;
         this.values1 = values;
        }
        /**
         * setter Methode.
         * @param titel -
         */
        public void setTitle (String titel)
        {
            this.titel1 = titel;

        }

        /**
         * Fügt der HashMap of Values eine Information hinzu.
         * Diese werden wie im folgenden Beispiel angezeigt:
         * "Health : 30"
         *
         * @param key   - key Definiert die Information Z.B ("Health")
         * @param value - Der Wert enthält die Informationen Z.B ("30")
         */
        public void addInfo (String key, String value)
        {
            this.values1.put(key, value);

        }

    }


