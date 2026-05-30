# |<<

**取样方式 (qc_checkmode / nc.vo.qc.checkmode.entity.CheckModeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4832.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkmode | 取样方式主键 | pk_checkmode | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | vcheckmodecode | 取样方式编码 | vcheckmodecode | varchar(50) |  | 字符串 (String) |
| 5 | vcheckmodename | 取样方式名称 | vcheckmodename | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | icheckmethod | 检验方式 | icheckmethod | int |  | 检验方式 (CheckMethodEnum) |  | 0=全检; |