
<div align="center">
  <img src="assets/logo.png" alt="Assurance Logo" width="200">
  <h1>Assurance</h1>
  <p><strong>Your passwords. Your privacy. Your control.</strong></p>
</div>
    
Assurance is a personal project focused on developing a secure, offline password manager using Java.

The goal is to create a simple and privacy-focused application that allows users to store, manage, and protect their credentials locally, without relying on cloud services.

This project is also an opportunity to learn more about Java development, cryptography, cybersecurity, and secure software design.

---


## About the Project

Assurance aims to provide a clean and intuitive way to manage passwords while keeping user data entirely on their own device.

Inspired by password managers such as Bitwarden and KeePass, the project focuses on three core principles:

- **Privacy:** No cloud storage, accounts, or external servers.
- **Security:** Encrypted local storage and secure password management.
- **Simplicity:** A minimal and user-friendly experience.

## Planned Features

### Password Management
- Add, edit, delete, and organize credentials.
- Search through saved accounts.
- Generate strong, random passwords.
- Copy credentials to the clipboard.

### Security & Encryption
- Master password authentication.
- Encrypted local password vault.
- AES-256-GCM encryption.
- Secure key derivation using Argon2id.
- Automatic vault locking.

### User Interface
- Clean and modern desktop interface.
- Simple navigation and password organization.
- Light and dark themes.

## Technologies

- **Java** — Core application development.
- **JavaFX** — Planned desktop user interface.
- **Git & GitHub** — Version control and project management.

Additional libraries and technologies will be introduced as the project evolves.

## Development Roadmap

### v0.1 — Project Initialization & Console Interface

- [x] Create the GitHub repository.
- [x] Set up the Java project structure.
- [x] Implement the main console menu.
- [x] Add basic menu navigation and exit functionality.
- [x] Implement input validation and error handling.

### v0.2 — Credential Management

- [x] Create the `Credential` class.
- [x] Add credentials using fictional test data.
- [x] View saved accounts.
- [ ] Search for credentials.
- [ ] Edit and delete credentials.
- [x] Manage credentials in memory using collections.

### v0.3 — Security & Local Storage

- [ ] Research secure password storage and encryption.
- [ ] Implement master password protection.
- [ ] Implement secure key derivation using Argon2id.
- [ ] Encrypt the local vault using AES-256-GCM.
- [ ] Add encrypted local data persistence.
- [ ] Implement vault locking and unlocking.

### v0.4 — Desktop Application

- [ ] Set up JavaFX.
- [ ] Create a graphical login and unlock screen.
- [ ] Design the main vault interface.
- [ ] Add credential management forms.
- [ ] Implement search and filtering.
- [ ] Add light and dark themes.

### v0.5 — Additional Features

- [ ] Implement a secure password generator.
- [ ] Add clipboard functionality.
- [ ] Implement automatic vault locking.
- [ ] Add encrypted backup and restore functionality.

### v1.0 — Testing & Improvements

- [ ] Add automated unit tests.
- [ ] Test encryption, decryption, and data integrity.
- [ ] Improve error handling and input validation.
- [ ] Review security risks and sensitive data handling.
- [ ] Improve documentation and installation instructions.
- [ ] Prepare an initial release.

## Project Status

**Early Development — v0.1**

Assurance is currently in its initial development stage. Features, architecture, and security mechanisms may change as the project evolves.

**Security notice:** Assurance is an educational project and has not undergone a professional security audit. It should not be used to store real or sensitive credentials.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
