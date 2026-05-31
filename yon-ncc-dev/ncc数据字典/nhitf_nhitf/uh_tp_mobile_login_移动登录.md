# |<<

**移动登录 (uh_tp_mobile_login / com.yonyou.yh.nhis.itf.sds.vo.TPMobileLoginVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6282.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_login | 登录主键 | pk_login | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_acc | 账户主键 | pk_acc | varchar(50) |  | 字符串 (String) |
| 5 | login_date | 登录日期 | login_date | char(19) |  | 日期 (UFDate) |
| 6 | logout_date | 注销日期 | logout_date | char(19) |  | 日期 (UFDate) |
| 7 | pat_telno | 手机号 | pat_telno | varchar(20) |  | 字符串 (String) |
| 8 | ip_addr | IP地址 | ip_addr | varchar(50) |  | 字符串 (String) |
| 9 | cndv_idnf_no | 访问设备识别编号 | cndv_idnf_no | varchar(50) |  | 字符串 (String) |
| 10 | cndv_os_cd | 访问设备运行系统编号 | cndv_os_cd | varchar(2) |  | 字符串 (String) |
| 11 | extr_ntf_mdvc_idnf_no | 外部通知移动备识别编号 | extr_ntf_mdvc_idnf_no | varchar(50) |  | 字符串 (String) |
| 12 | login_result_code | 登录结果代码 | login_result_code | varchar(2) |  | 字符串 (String) |
| 13 | note | 备注 | note | varchar(256) |  | 字符串 (String) |