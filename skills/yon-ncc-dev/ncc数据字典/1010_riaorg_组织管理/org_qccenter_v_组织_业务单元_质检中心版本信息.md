# |<<

**组织_业务单元_质检中心版本信息 (org_qccenter_v / nc.vo.vorg.QcCenterVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4142.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_qccenter | 主键 | pk_qccenter | char(0) | √ | 组织_业务单元_质检中心 (qccenter) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |