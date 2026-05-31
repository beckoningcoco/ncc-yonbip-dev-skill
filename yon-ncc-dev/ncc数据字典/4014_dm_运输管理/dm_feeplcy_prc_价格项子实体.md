# |<<

**价格项子实体 (dm_feeplcy_prc / nc.vo.dm.policy.entity.FeePlcyPrcVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1726.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_feeplcy_prc | 价格项子实体 | pk_feeplcy_prc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 4 | vitemcode | 价格项编码 | vitemcode | varchar(40) |  | 字符串 (String) |
| 5 | vitemname | 价格项 | vitemname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | vshowname | 显示名称 | vshowname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | benableflag | 启用 | benableflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bbatprcflag | 批量定价 | bbatprcflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | vbatformulacode | 批量依据公式编码 | vbatformulacode | varchar(200) |  | 字符串 (String) |
| 10 | cbatlevelid | 批量分级范围 | cbatlevelid | varchar(20) |  | 批量分级主实体 (batrange) |
| 11 | vbatunit | 批量单位 | vbatunit | varchar(200) |  | 字符串 (String) |
| 12 | bquotedflag | 引用 | bquotedflag | char(1) |  | 布尔类型 (UFBoolean) |