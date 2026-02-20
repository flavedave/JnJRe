import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MatCardModule } from '@angular/material/card';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';

@Component({
  selector: 'app-chat',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    MatCardModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatIconModule,
    MatListModule,
  ],
  template: `
    <h1>KI-Assistent</h1>
    <mat-card class="chat-card">
      <mat-card-content>
        <div class="chat-messages">
          <div class="message assistant">
            <p>Hallo! Ich bin Ihr KI-Assistent. Wie kann ich Ihnen heute helfen?</p>
          </div>
          @for (message of messages; track message) {
            <div class="message" [class.user]="message.sender === 'user'" [class.assistant]="message.sender === 'assistant'">
              <p>{{ message.text }}</p>
            </div>
          }
        </div>
      </mat-card-content>

      <mat-card-actions class="chat-input">
        <mat-form-field appearance="outline" class="full-width">
          <mat-label>Nachricht eingeben...</mat-label>
          <input matInput [(ngModel)]="currentMessage" (keyup.enter)="sendMessage()" />
        </mat-form-field>
        <button mat-fab color="primary" (click)="sendMessage()" [disabled]="!currentMessage.trim()">
          <mat-icon>send</mat-icon>
        </button>
      </mat-card-actions>
    </mat-card>
  `,
  styles: [`
    h1 {
      color: #333;
      margin-bottom: 16px;
    }

    .chat-card {
      max-width: 800px;
      height: calc(100vh - 200px);
      display: flex;
      flex-direction: column;
    }

    .chat-messages {
      flex: 1;
      overflow-y: auto;
      padding: 16px 0;
    }

    .message {
      padding: 12px 16px;
      margin-bottom: 8px;
      border-radius: 12px;
      max-width: 70%;
    }

    .message.user {
      background-color: #3f51b5;
      color: white;
      margin-left: auto;
    }

    .message.assistant {
      background-color: #e8eaf6;
      color: #333;
    }

    .message p {
      margin: 0;
    }

    .chat-input {
      display: flex;
      gap: 8px;
      align-items: center;
      padding: 8px 0 0;
    }

    .full-width {
      flex: 1;
    }
  `],
})
export class ChatComponent {
  currentMessage = '';
  messages: Array<{ sender: string; text: string }> = [];

  sendMessage(): void {
    const text = this.currentMessage.trim();
    if (!text) {
      return;
    }

    this.messages.push({ sender: 'user', text });
    this.currentMessage = '';

    // Placeholder: simulate assistant response
    setTimeout(() => {
      this.messages.push({
        sender: 'assistant',
        text: 'Vielen Dank fuer Ihre Nachricht. Diese Funktion wird bald verfuegbar sein.',
      });
    }, 1000);
  }
}
