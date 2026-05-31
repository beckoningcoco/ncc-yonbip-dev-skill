# |<<

**计量器具级别 (pd_meainstrucl / nc.vo.ic.mscl.entity.MscVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4356.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmeainstruclid | 计量器具级别 | cmeainstruclid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | classcode | 级别编码 | classcode | varchar(40) |  | 字符串 (String) |
| 6 | classname | 级别名称 | classname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | badjust | 调差 | badjust | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 9 | enablestate | 启用状态 | enablestate | varchar(50) |  | 生产制造启用状态 (RcEnum) | 2 | 2=已启用; |