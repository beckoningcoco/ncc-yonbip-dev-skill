# |<<

**利润中心成本域 (org_liactcostrg / nc.vo.org.liactcostrg.LiactCostrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4093.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_liactcostrg | 利润中心成本域主键 | pk_liactcostrg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属利润中心 | pk_org | varchar(20) | √ | 组织_业务单元_责任组织 (liabilitycenter) |
| 4 | code | 利润中心成本域编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 利润中心成本域名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | shortname | 简称 | shortname | varchar(200) |  | 字符串 (String) |
| 7 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | memo | 说明 | memo | varchar(200) |  | 备注 (Memo) |
| 9 | enablestate | 启用状态 | enablestate | varchar(50) | √ | 启用状态 (enablestate) |  | 1=未启用; |