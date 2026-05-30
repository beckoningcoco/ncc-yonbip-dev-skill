# |<<

**转财务调入子实体 (to_settlein_b / nc.vo.to.m5f.entity.STranFinInItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5809.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 子表主键 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 调入财务组织 | pk_org | char(0) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | cipstid | 结算调入主实体 | cipstid | char(20) | √ | 待结算调入单主实体 (to_presettlein) |
| 4 | cipst_bid | 结算调入子实体 | cipst_bid | varchar(20) |  | 待结算调入单子实体 (to_presettlein_b) |
| 5 | cipst_bbid | 结算调入子子实体 | cipst_bbid | varchar(20) |  | 待结算调入单子子实体 (to_presettlein_bb) |
| 6 | cslistid | 结算清单主实体 | cslistid | varchar(20) |  | 结算清单主实体 (to_settlelist) |
| 7 | cslist_bid | 结算清单子实体 | cslist_bid | varchar(20) |  | 结算清单子实体 (to_settlelist_b) |
| 8 | cslist_bbid | 结算清单子子实体 | cslist_bbid | char(20) | √ | 结算清单子子实体 (to_settlelist_bb) |
| 9 | bcanapflag | 是否可传应付 | bcanapflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | bcaniaflag | 是否可传存货 | bcaniaflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | fapstatusflag | 传应付状态 | fapstatusflag | int |  | 待结算调入传应付状态 (pushiniaflag) |  | 0=NONE; |