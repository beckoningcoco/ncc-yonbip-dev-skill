# |<<

**协同信息 (arap_bcmap / nc.vo.arap.billconfer.BcMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/152.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | bcmapid | 协同信息主键 | bcmapid | char(20) | √ | 主键 (UFID) |
| 2 | src_billtype | 来源单据类型 | src_billtype | varchar(20) |  | 字符串 (String) |
| 3 | src_billid | 来源单据主键 | src_billid | char(20) |  | 主键 (UFID) |
| 4 | dest_billtype | 目标单据类型 | dest_billtype | varchar(20) |  | 字符串 (String) |
| 5 | dest_billid | 目标单据主键 | dest_billid | char(20) |  | 主键 (UFID) |