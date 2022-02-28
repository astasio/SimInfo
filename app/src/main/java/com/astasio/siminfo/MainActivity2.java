package com.astasio.siminfo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView view = findViewById(R.id.textView);

        String formattedText = "Parametri di configurazione APN per l'accesso ad Internet\nPer configurare l' <b>APN NTMobile</b> su smartphone Android in Italia seguite le seguenti indicazioni : <br/>\n andiamo su impostazioni > Wireless e Reti > Reti Mobili > Nomi punti di accesso >\n qui andiamo sul Menu e selezioniamo <b>Nuovo APN</b>. \n<br/>Compilate ora il modulo che vi viene proposto seguendo le indicazioni che trovate di seguito :\n\n<h4> APN NTMobile</h4>\n<ul>\n<li><b>Nome</b> – internet ntmobile</li>\n<li><b>APN</b> – internet.ntmobile.it</li>\n<li><b>Proxy</b> –</li>\n<li><b>Porta</b> –</li>\n<li><b>Nome utente</b> –</li>\n<li><b>Password</b> –</li>\n<li><b>Server</b> –</li>\n<li><b>MMSC</b> – </li>\n<li><b>Proxy MMS</b> – </li>\n<li><b>Porta MMS</b> – </li>\n<li><b>MCC</b> – </li>\n<li><b>MNC</b> – </li>\n<li><b>Tipo di autenticazione</b> – Nessuno</li>\n<li><b>Tipo APN</b> – internet </li>\n<li><b>Protocollo APN</b> – IPv4v6</li>\n<li><b>Protocollo roaming APN</b> – IPv4</li>\n<li><b>Attiva/disattiva APN</b> – APN attivato</li>\n<li><b>Connessione</b> –</li>\n<li><b>Tipo operatore virtuale di rete mobile</b> –</li>\n<li><b>Valore operatore virtuale di rete mobile</b> –</li>\n</ul>\n<p> Ricordatevi di mantenere i valori predefiniti del dispositivo\n per tutti i campi vuoti che abbiamo indicato qui sopra,\n ed attiviamo Dati Attivati e Roaming Dati.";

        view.setText(HtmlCompat.fromHtml(formattedText, HtmlCompat.FROM_HTML_MODE_LEGACY));
    }
}