package lesson_2.Ex006.Interface;

import lesson_2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
