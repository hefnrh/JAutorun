package com.hefnrh.jautorun;

import com.registry.RegistryKey;
import com.registry.RegistryValue;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
//        printLogon();
//        printServices();
//        printIEBHO();
//        printTaskScheduler();
        printDrivers();
    }

    public static void printLogon() {
        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "System\\CurrentControlSet\\Control\\Terminal Server\\Wds\\rdpwd\\StartupPrograms",
                "HKLM\\System\\CurrentControlSet\\Control\\Terminal Server\\Wds\\rdpwd\\StartupPrograms\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Winlogon\\AppSetup",
                "HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Winlogon\\AppSetup\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "Software\\Policies\\Microsoft\\Windows\\System\\Scripts\\Startup",
                "HKLM\\Software\\Policies\\Microsoft\\Windows\\System\\Scripts\\Startup\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "Software\\Policies\\Microsoft\\Windows\\System\\Scripts\\Logon",
                "HKCU\\Software\\Policies\\Microsoft\\Windows\\System\\Scripts\\Logon\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "Software\\Policies\\Microsoft\\Windows\\System\\Scripts\\Logon",
                "HKLM\\Software\\Policies\\Microsoft\\Windows\\System\\Scripts\\Logon\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Winlogon\\Userinit",
                "HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Winlogon\\Userinit\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\System\\Shell",
                "HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\System\\Shell\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Winlogon\\Shell",
                "HKCU\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Winlogon\\Shell\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\System\\Shell",
                "HKLM\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\System\\Shell\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Winlogon\\Shell",
                "HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Winlogon\\Shell\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Winlogon\\Taskman",
                "HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Winlogon\\Taskman\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\TerminalServer\\Install\\Software\\Microsoft\\Windows\\CurrentVersion\\Runonce",
                "HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\TerminalServer\\Install\\Software\\Microsoft\\Windows\\CurrentVersion\\Runonce\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\TerminalServer\\Install\\Software\\Microsoft\\Windows\\CurrentVersion\\RunonceEx",
                "HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\TerminalServer\\Install\\Software\\Microsoft\\Windows\\CurrentVersion\\RunonceEx\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\TerminalServer\\Install\\Software\\Microsoft\\Windows\\CurrentVersion",
                "HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\TerminalServer\\Install\\Software\\Microsoft\\Windows\\CurrentVersion\\Run\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run",
                "HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\Run",
                "HKLM\\SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\Run\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\RunOnceEx",
                "HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\RunOnceEx\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\RunOnceEx",
                "HKLM\\SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\RunOnceEx\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\RunOnce",
                "HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\RunOnce\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\RunOnce",
                "HKLM\\SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\RunOnce\t\t\t");

        printDirExe("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Startup");
        printDirExe("C:\\Users\\GuYifan\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Startup");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "Software\\Microsoft\\Windows NT\\CurrentVersion\\Windows\\Load",
                "HKCU\\Software\\Microsoft\\Windows NT\\CurrentVersion\\Windows\\Load\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "Software\\Microsoft\\Windows NT\\CurrentVersion\\Windows\\Run",
                "HKCU\\Software\\Microsoft\\Windows NT\\CurrentVersion\\Windows\\Run\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\Run",
                "HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\Run\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\Run",
                "HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Policies\\Explorer\\Run\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "Software\\Microsoft\\Windows\\CurrentVersion\\Run",
                "HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Run\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "Software\\Microsoft\\Windows\\CurrentVersion\\RunOnce",
                "HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\RunOnce\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\TerminalServer\\Install\\Software\\Microsoft\\Windows\\CurrentVersion\\Runonce",
                "HKCU\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\TerminalServer\\Install\\Software\\Microsoft\\Windows\\CurrentVersion\\Runonce\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\TerminalServer\\Install\\Software\\Microsoft\\Windows\\CurrentVersion\\RunonceEx",
                "HKCU\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\TerminalServer\\Install\\Software\\Microsoft\\Windows\\CurrentVersion\\RunonceEx\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\TerminalServer\\Install\\Software\\Microsoft\\Windows\\CurrentVersion\\Run",
                "HKCU\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\TerminalServer\\Install\\Software\\Microsoft\\Windows\\CurrentVersion\\Run\t\t\t");
    }

    static void printIEBHO() {
        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Browser Helper Objects",
                "HKLM\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Browser Helper Objects\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "Software\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Browser Helper Objects",
                "HKLM\\Software\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Browser Helper Objects\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "Software\\Microsoft\\Internet Explorer\\UrlSearchHooks",
                "HKCU\\Software\\Microsoft\\Internet Explorer\\UrlSearchHooks\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "HKLM\\Software\\Microsoft\\Internet Explorer\\Toolbar",
                "HKLM\\Software\\Microsoft\\Internet Explorer\\Toolbar\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "Software\\Wow6432Node\\Microsoft\\Internet Explorer\\Toolbar",
                "HKLM\\Software\\Wow6432Node\\Microsoft\\Internet Explorer\\Toolbar\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "Software\\Microsoft\\Internet Explorer\\Explorer Bars",
                "HKCU\\Software\\Microsoft\\Internet Explorer\\Explorer Bars\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "Software\\Microsoft\\Internet Explorer\\Explorer Bars",
                "HKLM\\Software\\Microsoft\\Internet Explorer\\Explorer Bars\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "Software\\Wow6432Node\\Microsoft\\Internet Explorer\\Explorer Bars",
                "HKCU\\Software\\Wow6432Node\\Microsoft\\Internet Explorer\\Explorer Bars\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "Software\\Wow6432Node\\Microsoft\\Internet Explorer\\Explorer Bars",
                "HKLM\\Software\\Wow6432Node\\Microsoft\\Internet Explorer\\Explorer Bars\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "Software\\Microsoft\\Internet Explorer\\Extensions",
                "HKCU\\Software\\Microsoft\\Internet Explorer\\Extensions\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "Software\\Microsoft\\Internet Explorer\\Extensions",
                "HKLM\\Software\\Microsoft\\Internet Explorer\\Extensions\t\t\t");

        printKeyValue(RegistryKey.HKEY_CURRENT_USER_INDEX,
                "Software\\Wow6432Node\\Microsoft\\Internet Explorer\\Extensions",
                "HKCU\\Software\\Wow6432Node\\Microsoft\\Internet Explorer\\Extensions\t\t\t");

        printKeyValue(RegistryKey.HKEY_LOCAL_MACHINE_INDEX,
                "Software\\Wow6432Node\\Microsoft\\Internet Explorer\\Extensions",
                "HKLM\\Software\\Wow6432Node\\Microsoft\\Internet Explorer\\Extensions\t\t\t");
    }

    static void printServices() {
        RegistryKey key = RegistryKey.getRootKeyForIndex(RegistryKey.HKEY_LOCAL_MACHINE_INDEX)
                .getSubKey("System\\CurrentControlSet\\Services");
        System.out.println("HKLM\\System\\CurrentControlSet\\Services\t\t\t");
        for (RegistryKey k : key.getSubKeys()) {
            RegistryValue vStart = k.getValue("start");
            RegistryValue vType = k.getValue("type");
            if (vStart == null || vType == null) {
                continue;
            }
            byte[] data = vType.getByteData();
            // start type && service type check
            if (vStart.getByteData()[0] == 0x02 && (data[0] == 0x10 || data[0] == 0x20)) {
                System.out.println("\t" + k.getName() + "\t" + k.getValue("ImagePath"));
            }
        }
    }

    static void printDrivers() {
        RegistryKey key = RegistryKey.getRootKeyForIndex(RegistryKey.HKEY_LOCAL_MACHINE_INDEX)
                .getSubKey("System\\CurrentControlSet\\Services");
        System.out.println("HKLM\\System\\CurrentControlSet\\Services\t\t\t");
        for (RegistryKey k : key.getSubKeys()) {
            RegistryValue vType = k.getValue("type");
            if (vType == null) {
                continue;
            }
            byte[] data = vType.getByteData();
            // service type check
            if ((data[0] == 0x01) && k.getValue("ImagePath") != null) {
                System.out.println("\t" + k.getName() + "\t" + k.getValue("ImagePath"));
            }
        }
    }

    static void printTaskScheduler() {
        for (File f : new File("C:\\Windows\\System32\\Tasks").listFiles()) {
            if (f.isDirectory()) {
                continue;
            }
            try {
                DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                Document doc = builder.parse(f);
                Element root = doc.getDocumentElement();
                NodeList nodeList = root.getChildNodes();
                for (int i = 0, j = nodeList.getLength(); i < j; ++i) {
                    Node node = nodeList.item(i);
                    if (!node.getNodeName().equals("Triggers")) {
                        continue;
                    }
                    NodeList triggers = node.getChildNodes();
                    for (int k = 0, l = triggers.getLength(); k < l; ++k) {
                        Node trigger = triggers.item(k);
                        if (!trigger.getNodeName().equals("CalendarTrigger")) {
                            continue;
                        }
                        System.out.println("\t" + f.getAbsolutePath());
                        break;
                    }
                    break;
                }
            } catch (SAXException | IOException | ParserConfigurationException e) {
                e.printStackTrace();
            }
        }
    }

    static void printKeyValue(int index, String subkey, String path) {
        RegistryKey key = RegistryKey.getRootKeyForIndex(index).getSubKey(subkey);
        System.out.println(path);
        if (key == null) {
            int split = subkey.lastIndexOf('\\');
            String parentKey = subkey.substring(0, split);
            String name = subkey.substring(split + 1);
            key = RegistryKey.getRootKeyForIndex(index).getSubKey(parentKey);
            if (key != null) {
                RegistryValue value = key.getValue(name);
                if (value != null) {
                    System.out.println("\t" + key.getValue(name));
                }
            }
        } else {
            for (String name : key.getValueNames()) {
                System.out.println("\t" + key.getValue(name));
            }
        }
        System.out.println();
    }


    static void printDirExe(String path) {
        File dir = new File(path);
        System.out.println(path);
        File[] fs = dir.listFiles();
        if (fs != null) {
            for (File f : fs) {
                if (f.getName().endsWith(".exe")) {
                    System.out.println('\t' + f.getAbsolutePath());
                }
            }
        }
        System.out.println();
    }

}
