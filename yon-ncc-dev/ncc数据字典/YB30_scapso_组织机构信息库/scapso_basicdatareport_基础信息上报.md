# |<<

**基础信息上报 (scapso_basicdatareport / nc.vo.scapso.basicdatareport.BasicDataReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5102.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_basicdatareport | 基础信息上报主键 | pk_basicdatareport | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 行政组织 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 4 | pk_org_v | 行政组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 5 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 经办人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | vbillname | 单位名称 | vbillname | varchar(200) |  | 多语文本 (MultiLangText) |
| 10 | vsimpshortname | 中文简称 | vsimpshortname | varchar(64) |  | 字符串 (String) |
| 11 | venglishname | 英文全称 | venglishname | varchar(512) |  | 字符串 (String) |
| 12 | venglishshortname | 英文简称 | venglishshortname | varchar(64) |  | 字符串 (String) |
| 13 | vdemestic | 境内境外标志 | vdemestic | varchar(50) |  | 境内外 (ScapSoDemesticEnum) |  | 1=境内; |