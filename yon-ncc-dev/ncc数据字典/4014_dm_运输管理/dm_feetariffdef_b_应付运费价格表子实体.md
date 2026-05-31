# |<<

**应付运费价格表子实体 (dm_feetariffdef_b / nc.vo.dm.tariffdef.entity.FeeTariffDefBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1730.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tariffdef_b | 应付运费价格表子实体 | pk_tariffdef_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 4 | fdataitemflag | 数据项 | fdataitemflag | varchar(20) |  | 运费价格表定义表体显示项 (fdataitemflag) |  | ctranstypeid=运输类型; |