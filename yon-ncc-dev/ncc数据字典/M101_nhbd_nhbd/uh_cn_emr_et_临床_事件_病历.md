# |<<

**临床_事件_病历 (uh_cn_emr_et / com.yonyou.yh.nhis.bd.ecd.vo.CNEventEMRVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5998.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnemret | 临床事件主键 | pk_cnemret | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_pati | 患者编码 | pk_pati | varchar(50) |  | 字符串 (String) |
| 5 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(50) |  | 字符串 (String) |
| 6 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_pv | 就诊编码 | pk_pv | varchar(50) |  | 字符串 (String) |
| 8 | date_et | 事件日期 | date_et | char(19) |  | 日期时间 (UFDateTime) |
| 9 | name | 事件名称 | name | varchar(50) |  | 字符串 (String) |
| 10 | describe | 事件描述 | describe | varchar(256) |  | 字符串 (String) |
| 11 | eu_ettype | 医疗事件类型 | eu_ettype | varchar(5) |  | 临床事件类型_EMR (EtEMRType) |  | 5=入科; |