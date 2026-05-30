# |<<

**备料计划交易类型 (mm_pickmtranstype / nc.vo.mmpac.pickm.entity.PickmTransTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3726.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pickmtranstype | 备料计划交易类型主键 | pk_pickmtranstype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | ctrantypeid | 交易类型主键 | ctrantypeid | char(20) |  | 主键 (UFID) |
| 4 | vtrantypecode | 备料计划交易类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 5 | bcaneditafteraudit | 备料计划审核后是否可改 | bcaneditafteraudit | char(1) |  | 布尔类型 (UFBoolean) | 0 |
| 6 | bautofinish | 备料计划是否自动完成 | bautofinish | char(1) |  | 布尔类型 (UFBoolean) | 1 |
| 7 | bcontainwaste | 备料计划是否考虑损耗 | bcontainwaste | char(1) |  | 布尔类型 (UFBoolean) | 1 |
| 8 | bissubcontract | 是否委外 | bissubcontract | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | fpickmtype | 业务类型 | fpickmtype | int |  | 业务类型 (FpickmtypeEnum) | 1 | 1=生产; |