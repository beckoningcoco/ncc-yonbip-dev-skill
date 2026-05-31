# |<<

**计量器具维护 (pd_meastool / nc.vo.ic.mst.entity.MeasToolVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4357.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmeastoolid | 计量器具维护 | cmeastoolid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vmeastoolcode | 编码 | vmeastoolcode | varchar(40) |  | 字符串 (String) |
| 6 | vmeastoolname | 名称 | vmeastoolname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | vgroupnum | 组号 | vgroupnum | varchar(40) |  | 字符串 (String) |
| 8 | cmeasclassid | 计量器具级别 | cmeasclassid | varchar(20) |  | 计量器具级别 (pd_meainstrucl) |
| 9 | fcopytype | 抄值类型 | fcopytype | varchar(50) | √ | 抄值类型 (copytype) | 1 | 1=数值; |