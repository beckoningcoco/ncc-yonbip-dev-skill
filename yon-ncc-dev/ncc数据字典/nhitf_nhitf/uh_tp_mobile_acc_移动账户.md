# |<<

**移动账户 (uh_tp_mobile_acc / com.yonyou.yh.nhis.itf.sds.vo.TPMobileAccVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6280.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_acc | 账户主键 | pk_acc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 字符串 (String) |
| 4 | org_code | 机构编码 | org_code | varchar(50) |  | 字符串 (String) |
| 5 | code | 编码 | code | varchar(30) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | password | 密码 | password | varchar(50) |  | 字符串 (String) |
| 8 | acc_type | 账户类别 | acc_type | varchar(20) |  | 字符串 (String) |
| 9 | tp_code | 第三方编码 | tp_code | varchar(20) |  | 字符串 (String) |
| 10 | pk_pati | 患者主键 | pk_pati | char(20) |  | 主键 (UFID) |
| 11 | paticode | 患者编码 | paticode | varchar(30) |  | 字符串 (String) |
| 12 | country_code | 国家代码 | country_code | varchar(30) |  | 字符串 (String) |
| 13 | country_telno | 国家区号 | country_telno | varchar(30) |  | 字符串 (String) |
| 14 | pat_telno | 手机号 | pat_telno | varchar(20) |  | 字符串 (String) |
| 15 | pat_email | 申请人邮箱 | pat_email | varchar(30) |  | 字符串 (String) |
| 16 | pat_zip | 申请人邮编 | pat_zip | varchar(20) |  | 字符串 (String) |
| 17 | apl_idfr | 申请识别符 | apl_idfr | varchar(300) |  | 字符串 (String) |
| 18 | athn_cd_no | 验证码编号 | athn_cd_no | varchar(10) |  | 字符串 (String) |
| 19 | abledate | 生效日期 | abledate | char(19) |  | 日期 (UFDate) |
| 20 | disabledate | 失效日期 | disabledate | char(19) |  | 日期 (UFDate) |
| 21 | flag_online | 在线标志 | flag_online | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | eu_status | 账户状态 | eu_status | int |  | 整数 (Integer) |
| 23 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 24 | cndv_os_cd | 访问设备运行系统编号 | cndv_os_cd | varchar(2) |  | 字符串 (String) |
| 25 | cndv_idnf_no | 访问设备识别编号 | cndv_idnf_no | varchar(50) |  | 字符串 (String) |
| 26 | extr_ntf_mdvc_idnf_no | 外部通知移动备识别编号 | extr_ntf_mdvc_idnf_no | varchar(50) |  | 字符串 (String) |
| 27 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 28 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 29 | modifier | 最后修改人 | modifier | char(20) |  | 主键 (UFID) |
| 30 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |