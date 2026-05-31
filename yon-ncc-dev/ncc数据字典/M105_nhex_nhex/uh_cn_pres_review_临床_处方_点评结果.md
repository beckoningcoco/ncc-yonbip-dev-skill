# |<<

**临床_处方_点评结果 (uh_cn_pres_review / com.yonyou.yh.nhis.bd.cnpresreview.vo.CnPresReviewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6050.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnpresview | 处方点评主键 | pk_cnpresview | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pres | 处方 | pk_pres | varchar(20) |  | 临床_处方 (cnordprescribe) |
| 5 | date_pharreview | 点评日期 | date_pharreview | char(19) |  | 日期时间 (UFDateTime) |
| 6 | flag_phar | 药师点评标志 | flag_phar | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | result_review | 点评结果 | result_review | varchar(50) |  | 字符串 (String) |
| 8 | pk_psn_phar | 点评药师 | pk_psn_phar | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | name_psn_phar | 点评药师名称 | name_psn_phar | varchar(50) |  | 字符串 (String) |
| 10 | flag_review | 医生确认标志 | flag_review | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | date_doctreview | 医生确认日期 | date_doctreview | char(19) |  | 日期时间 (UFDateTime) |
| 12 | pk_psn_docreview | 确认医生 | pk_psn_docreview | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | name_psn_docreview | 确认医生名称 | name_psn_docreview | varchar(50) |  | 字符串 (String) |
| 14 | note | 备注 | note | varchar(50) |  | 字符串 (String) |