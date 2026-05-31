# |<<

**物料批次号规则 (scm_batchcode_rule / nc.vo.scmf.ic.batchcoderule.BatchcodeRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5207.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchcoderule | 批次号主键 | pk_batchcoderule | char(20) | √ | 主键 (UFID) |
| 2 | pk_marbasclass | 物料基本分类主键 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 3 | object1 | 业务对象1 | object1 | varchar(20) |  | 字符串 (String) |
| 4 | object2 | 业务对象2 | object2 | varchar(20) |  | 字符串 (String) |
| 5 | vyear | 年 | vyear | varchar(20) |  | 字符串 (String) |
| 6 | vmonth | 月 | vmonth | varchar(20) |  | 字符串 (String) |
| 7 | vday | 日 | vday | varchar(20) |  | 字符串 (String) |
| 8 | snnum | 流水号位数 | snnum | int |  | 整数 (Integer) |
| 9 | lastsn | 上一批号 | lastsn | varchar(20) |  | 字符串 (String) |
| 10 | snresetflag | 归零标志 | snresetflag | varchar(20) |  | 字符串 (String) |
| 11 | vprefix | 前缀 | vprefix | varchar(20) |  | 字符串 (String) |
| 12 | vsuffix | 后缀 | vsuffix | varchar(20) |  | 字符串 (String) |
| 13 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 14 | obj1length | 业务对象1长度 | obj1length | int |  | 整数 (Integer) |
| 15 | obj2length | 业务对象2长度 | obj2length | int |  | 整数 (Integer) |
| 16 | isbatchin | 是否允许同一批次多次入库 | isbatchin | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | isauto | 是否自动产生批号 | isauto | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | canchange | 是否可以修改 | canchange | char(1) |  | 布尔类型 (UFBoolean) |