# |<<

**住院属性 (uh_pv_ip / com.yonyou.yh.nhis.pv.pvipregister.vo.PatiVisitPvIpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6234.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pv_ip | 患者住院主键 | pk_pv_ip | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | date_di_nt | 通知出院日期 | date_di_nt | char(19) |  | 日期时间 (UFDateTime) |
| 5 | flag_surg | 是否手术标志 | flag_surg | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_srv_nurse | 护理等级 | pk_srv_nurse | varchar(50) |  | 字符串 (String) |
| 7 | pk_level_dise | 病情等级 | pk_level_dise | varchar(20) |  | 病情等级(自定义档案) (Defdoc-000202) |
| 8 | dt_level_dise | 病情等级编码 | dt_level_dise | varchar(50) |  | 字符串 (String) |
| 9 | pk_level_nutr | 营养等级 | pk_level_nutr | varchar(20) |  | 营养情况(自定义档案) (Defdoc-000203) |
| 10 | dt_level_nutr | 营养等级编码 | dt_level_nutr | varchar(50) |  | 字符串 (String) |
| 11 | pk_outcomes | 病情转归 | pk_outcomes | varchar(20) |  | 病情转归情况(自定义档案) (Defdoc-000110) |
| 12 | dt_outcomes | 病情转归编码 | dt_outcomes | varchar(50) |  | 字符串 (String) |
| 13 | flag_newborn | 新生儿标志 | flag_newborn | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | newborn | 新生儿数量 | newborn | int |  | 整数 (Integer) |
| 15 | flag_doc_commit | 病案转归标志 | flag_doc_commit | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | date_emr_commit | 病案转归日期 | date_emr_commit | char(19) |  | 日期时间 (UFDateTime) |
| 17 | pk_pv_ip_refmode | 患者来院方式 | pk_pv_ip_refmode | varchar(20) |  | 患者入院方式(自定义档案) (Defdoc-000104) |
| 18 | dt_pv_ip_refmode | 患者来院方式编码 | dt_pv_ip_refmode | varchar(50) |  | 字符串 (String) |
| 19 | pk_pv_ip_dischmode | 患者离院方式编码 | pk_pv_ip_dischmode | varchar(20) |  | 患者离院方式(自定义档案) (Defdoc-000105) |
| 20 | dt_pv_ip_dischmode | 患者离院方式 | dt_pv_ip_dischmode | varchar(50) |  | 字符串 (String) |
| 21 | pk_dept_phy_adm | 入院科室 | pk_dept_phy_adm | varchar(20) |  | 组织_部门 (dept) |
| 22 | pk_dept_nurse_adm | 入院病区 | pk_dept_nurse_adm | varchar(20) |  | 组织_部门 (dept) |
| 23 | pk_dept_phy_disc | 出院科室 | pk_dept_phy_disc | varchar(20) |  | 组织_部门 (dept) |
| 24 | pk_dept_nurse_disc | 出院病区 | pk_dept_nurse_disc | varchar(20) |  | 组织_部门 (dept) |
| 25 | pk_patict | 主要联系人 | pk_patict | varchar(20) |  | 字符串 (String) |
| 26 | name_cont | 联系人姓名 | name_cont | varchar(50) |  | 字符串 (String) |
| 27 | teleno | 联系电话 | teleno | varchar(50) |  | 字符串 (String) |
| 28 | flag_qa | 医师质控标志 | flag_qa | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | flag_nur_qa | 护士质控标志 | flag_nur_qa | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | times_ip | 住院次数 | times_ip | int |  | 整数 (Integer) |
| 31 | pk_mc | 医联体 | pk_mc | varchar(50) |  | 字符串 (String) |
| 32 | pk_pv | 就诊_主键 | pk_pv | char(20) |  | 主键 (UFID) |
| 33 | drgs_code | 药品编码 | drgs_code | varchar(100) |  | 字符串 (String) |
| 34 | drgs_name | 药品名称 | drgs_name | varchar(200) |  | 字符串 (String) |
| 35 | eu_emr_status | 病案转归状态 | eu_emr_status | int |  | 整数 (Integer) |
| 36 | pk_b1bf | pk_b1bf | pk_b1bf | char(20) |  | 主键 (UFID) |