# |<<

**患者就诊_关键字段变动历史 (uh_pv_hist / com.yonyou.yh.nhis.pv.pativisithist.vo.PatiVisitHistVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6226.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvhist | 患者就诊关键字段变动主键 | pk_pvhist | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 字符串 (String) |
| 5 | fldname | 字段名称 | fldname | varchar(50) |  | 字符串 (String) |
| 6 | date_chg | 修改日期 | date_chg | char(19) |  | 日期时间 (UFDateTime) |
| 7 | val_old | 原值 | val_old | varchar(50) |  | 字符串 (String) |
| 8 | val_new | 新值 | val_new | varchar(50) |  | 字符串 (String) |
| 9 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_psn | 改动人员 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | name_psn | 改动人员名称 | name_psn | varchar(50) |  | 字符串 (String) |