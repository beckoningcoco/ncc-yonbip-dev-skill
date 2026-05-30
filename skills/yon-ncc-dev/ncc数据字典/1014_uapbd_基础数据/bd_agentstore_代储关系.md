# |<<

**代储关系 (bd_agentstore / nc.vo.bd.stordoc.AgentstoreVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/329.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agentstore | 代储关系主键 | pk_agentstore | char(20) | √ | 主键 (UFID) |
| 2 | pk_stockorg | 库存组织 | pk_stockorg | char(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 3 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 4 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |