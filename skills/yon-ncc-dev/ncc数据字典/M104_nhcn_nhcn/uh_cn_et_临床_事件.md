# |<<

**临床_事件 (uh_cn_et / com.yonyou.yh.nhis.cn.cnevent.vo.CNEventVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6006.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnet | 临床事件主键 | pk_cnet | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_pati | 患者编码 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 6 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_pv | 就诊编码 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 8 | date_et | 事件日期 | date_et | char(19) |  | 日期时间 (UFDateTime) |
| 9 | name | 事件名称 | name | varchar(50) |  | 字符串 (String) |
| 10 | describe | 事件描述 | describe | varchar(256) |  | 字符串 (String) |
| 11 | eu_ettype | 医疗事件类型 | eu_ettype | int |  | 临床事件类型 (EtType) |  | 0=诊断; |