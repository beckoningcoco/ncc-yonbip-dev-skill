# |<<

**周转材租出维修单 (rom_maintain / nc.vo.rom.maintain.MaintainHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4997.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_maintain | 维修单主键 | pk_maintain | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 租出组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 租出组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | bill_code | 维修单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 6 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |