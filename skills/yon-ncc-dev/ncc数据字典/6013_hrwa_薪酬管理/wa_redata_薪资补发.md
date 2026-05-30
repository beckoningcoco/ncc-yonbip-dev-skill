# |<<

**薪资补发 (wa_redata / nc.vo.wa.repay.ReDataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6352.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_redata | 补发表主键 | pk_wa_redata | char(20) | √ | 主键 (UFID) |
| 2 | pk_psndoc | 人员基本信息 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 3 | pk_psnjob | 人员工作记录 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 4 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 主键 (UFID) |
| 5 | assgid | 任职关系ID | assgid | int |  | 整数 (Integer) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_wa_class | 薪资方案主键 | pk_wa_class | varchar(20) |  | 薪资方案 (WaClassVO) |
| 9 | cyear | 年度 | cyear | char(4) |  | 主键 (UFID) |
| 10 | cperiod | 期间 | cperiod | char(2) |  | 主键 (UFID) |
| 11 | creperiod | 补发期间 | creperiod | varchar(2) |  | 字符串 (String) |
| 12 | creyear | 补发年度 | creyear | varchar(4) |  | 字符串 (String) |
| 13 | stopflag | 停发标志 | stopflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 14 | caculateflag | 重计算标志 | caculateflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 15 | reflag | 补发标志 | reflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 16 | workorg | 任职组织 | workorg | varchar(20) |  | 组织 (org) |
| 17 | workorgvid | 任职组织版本 | workorgvid | varchar(20) |  | 组织_版本信息 (org_v) |
| 18 | workdept | 任职部门 | workdept | varchar(20) |  | 组织_部门 (dept) |
| 19 | workdeptvid | 任职部门版本 | workdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |