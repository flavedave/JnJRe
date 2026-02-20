import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';
import { MatDividerModule } from '@angular/material/divider';

@Component({
  selector: 'app-consulting',
  standalone: true,
  imports: [MatCardModule, MatIconModule, MatDividerModule],
  template: `
    <h1>Beratung</h1>
    <div class="consulting-grid">
      <mat-card>
        <mat-card-header>
          <mat-icon mat-card-avatar>assignment</mat-icon>
          <mat-card-title>Bedarfserhebung</mat-card-title>
        </mat-card-header>
        <mat-card-content>
          <p>
            Strukturierte Erfassung des Kundenbedarfs. Identifizieren Sie
            Versicherungsluecken und erstellen Sie individuelle Bedarfsanalysen.
          </p>
        </mat-card-content>
      </mat-card>

      <mat-card>
        <mat-card-header>
          <mat-icon mat-card-avatar>analytics</mat-icon>
          <mat-card-title>IST-Analyse</mat-card-title>
        </mat-card-header>
        <mat-card-content>
          <p>
            Analyse des aktuellen Versicherungsbestands Ihrer Kunden.
            Vergleichen Sie bestehende Vertraege mit dem ermittelten Bedarf.
          </p>
        </mat-card-content>
      </mat-card>

      <mat-card>
        <mat-card-header>
          <mat-icon mat-card-avatar>headset_mic</mat-icon>
          <mat-card-title>Live-Gespraechsunterstuetzung</mat-card-title>
        </mat-card-header>
        <mat-card-content>
          <p>
            KI-gestuetzte Echtzeit-Unterstuetzung waehrend des Beratungsgespraechs.
            Erhalten Sie kontextbezogene Vorschlaege und Argumentationshilfen.
          </p>
        </mat-card-content>
      </mat-card>
    </div>
  `,
  styles: [`
    h1 {
      color: #333;
      margin-bottom: 16px;
    }

    .consulting-grid {
      display: grid;
      grid-template-columns: repeat(auto-fill, minmax(320px, 1fr));
      gap: 24px;
    }

    mat-card {
      height: 100%;
    }
  `],
})
export class ConsultingComponent {}
