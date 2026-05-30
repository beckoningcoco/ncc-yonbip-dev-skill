# |<<

**检验项目 (qc_checkitem / nc.vo.qc.checkitem.entity.CheckItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4831.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkitem | 检验项目 | pk_checkitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | vcheckitemcode | 检验项目编码 | vcheckitemcode | varchar(50) |  | 字符串 (String) |
| 5 | vcheckitemname | 检验项目名称 | vcheckitemname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | parentcheckitem | 上级检验项目 | parentcheckitem | varchar(20) |  | 检验项目 (qc_checkitem) |
| 7 | bqpflag | 优质优价项目 | bqpflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | analymethod | 分析方法 | analymethod | int |  | 分析方法 (AnalyMethodEnum) |  | 0=定量分析; |