# |<<

**患者信息_病历 (uh_pi_doc / com.yonyou.yh.nhis.pi.patidoc.vo.PatiDocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6184.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patidoc | 患者病案管理信息主键 | pk_patidoc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | pk_patidoctype | 病案类型 | pk_patidoctype | varchar(20) |  | 病案类型(自定义档案) (Defdoc-000201) |
| 6 | dt_patidoctype | 病案类型编码 | dt_patidoctype | varchar(20) |  | 字符串 (String) |
| 7 | code_patidoc | 病案号码 | code_patidoc | varchar(30) |  | 字符串 (String) |
| 8 | addr_patidoc | 病案存放位置 | addr_patidoc | varchar(256) |  | 字符串 (String) |
| 9 | date_ceate | 建立日期 | date_ceate | char(19) |  | 日期时间 (UFDateTime) |
| 10 | pk_org_create | 建立机构 | pk_org_create | varchar(20) |  | 组织 (org) |
| 11 | pk_dept_create | 建立部门 | pk_dept_create | varchar(20) |  | 组织_部门 (dept) |
| 12 | pk_psn_create | 建立人员 | pk_psn_create | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | name_psn_create | 建立人员名称 | name_psn_create | varchar(50) |  | 字符串 (String) |