package com.example.timu.controller;
import com.example.timu.entity.Access;
import com.example.timu.entity.User;
import com.example.timu.entity.WeatherResponse;
import org.springframework.web.bind.annotation.*;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/core-api-v1/")
public class RandomController {
    @GetMapping("/weather")
    public WeatherResponse getWeather(@RequestParam String city) {
        // 模拟天气数据，实际情况应该调用天气API
        WeatherResponse weatherResponse = new WeatherResponse();
        weatherResponse.setCity(city);
        weatherResponse.setTemperature(25); // 示例温度
        weatherResponse.setDescription("晴天"); // 示例天气描述

        return weatherResponse;
    }

    @PostMapping("/user")
    public User getUser(@RequestBody User user) {
        return user;
    }

    @PostMapping("/product")
    public String createProduct(@RequestBody String product) {
        return "Product created: " + product;
    }

    @PostMapping("/order")
    public String createOrder(@RequestBody String order) {
        return "Order created: " + order;
    }

    @GetMapping("/customer")
    public String getCustomer() {
        return "Customer information";
    }

    @GetMapping("/invoice")
    public String getInvoice() {
        return "Invoice details";
    }

    @PostMapping("/payment")
    public String createPayment(@RequestBody String payment) {
        return "Payment processed: " + payment;
    }

    @GetMapping("/shipment")
    public String getShipment() {
        return "Shipment details";
    }


    @GetMapping("/review/{productId}")
    public String getReview(@PathVariable String productId) {
        return "Review for product ID: " + productId;
    }

    @PostMapping("/feedback")
    public String submitFeedback(@RequestBody String feedback) {
        return "Feedback submitted: " + feedback;
    }

    @GetMapping("/notification/{notificationId}")
    public String getNotification(@PathVariable String notificationId) {
        return "Notification details for ID: " + notificationId;
    }

    @GetMapping("/report")
    public String getReport() {
        return "Report information";
    }

    @GetMapping("/settings")
    public String getSettings() {
        return "Settings details";
    }

    @GetMapping("/activity/{userId}")
    public String getActivity(@PathVariable String userId) {
        return "Activity log for user ID: " + userId;
    }

    @PostMapping("/role")
    public String createRole(@RequestBody String role) {
        return "Role created: " + role;
    }

    @GetMapping("/session")
    public String getSession() {
        return "Session details";
    }

    @GetMapping("/token")
    public String getToken() {
        return "Authentication token";
    }

    @PostMapping("/summary")
    public String createSummary(@RequestBody String summary) {
        return "Summary created: " + summary;
    }

    @GetMapping("/dashboard")
    public String getDashboard() {
        return "Dashboard data";
    }

    @GetMapping("/analytics")
    public String getAnalytics(@RequestParam(required = false) String filter) {
        return "Analytics information with filter: " + filter;
    }

    @PostMapping("/performance")
    public String createPerformance(@RequestBody String performance) {
        return "Performance metrics created: " + performance;
    }

    @GetMapping("/audit/{auditId}")
    public String getAudit(@PathVariable String auditId) {
        return "Audit log details for ID: " + auditId;
    }

    @GetMapping("/maintenance")
    public String getMaintenance() {
        return "Maintenance schedule";
    }

    @GetMapping("/backup")
    public String getBackup() {
        return "Backup status";
    }

    @GetMapping("/restoration")
    public String getRestoration() {
        return "Restoration details";
    }

    @GetMapping("/issue/{issueId}")
    public String getIssue(@PathVariable String issueId) {
        return "Issue tracking information for ID: " + issueId;
    }

    @GetMapping("/faq")
    public String getFAQ() {
        return "Frequently Asked Questions";
    }

    @PostMapping("/tutorial")
    public String createTutorial(@RequestBody String tutorial) {
        return "Tutorial content created: " + tutorial;
    }

    @GetMapping("/resource/{resourceId}")
    public String getResource(@PathVariable String resourceId) {
        return "Resource information for ID: " + resourceId;
    }

    @GetMapping("/guide")
    public String getGuide() {
        return "User guide content";
    }

    @GetMapping("/updates/{version}")
    public String getUpdates(@PathVariable String version) {
        return "Latest updates for version: " + version;
    }

    @PostMapping("/support")
    public String contactSupport(@RequestBody String contact) {
        return "Support request submitted: " + contact;
    }

    @GetMapping("/legal")
    public String getLegal() {
        return "Legal information";
    }

    @GetMapping("/contact/{contactId}")
    public String getContact(@PathVariable String contactId) {
        return "Contact information for ID: " + contactId;
    }

    @GetMapping("/getAllApi")
    public Map getCategory() {
        Map map = new HashMap();
        map.put("系统api","/core-api-v1/system-api/");
        map.put("用户api","/core-api-v1/user-api/");
        map.put("测试api","/core-api-v1/test-api/");
        return map;
    }
    @PostMapping("/getflag")
    public String getFlag( @RequestBody Access access) {
        if (access.getName() == null || access.getSecretkey() == null) {
            return "认证失败!!!";
        }
        if(access.getName().equals("JJfly") && access.getSecretkey().equals("thereisakey!haha")){
            try {
                FileInputStream fileInputStream = new FileInputStream("/tmp/flag");
                byte[] bytes = new byte[fileInputStream.available()];
                fileInputStream.read(bytes);
                return new String(bytes);
            }
            catch (Exception e){
                return "flag配置失败, 请联系管理员";
            }
        }else{
            return "认证失败!!!";
        }
    }

    @GetMapping("/terms")
    public String getTerms() {
        return "Terms and Conditions";
    }

    @GetMapping("/privacy")
    public String getPrivacy() {
        return "Privacy Policy";
    }
}
