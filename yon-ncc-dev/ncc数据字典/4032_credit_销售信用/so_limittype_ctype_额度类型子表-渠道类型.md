# |<<

**额度类型子表-渠道类型 (so_limittype_ctype / nc.vo.credit.limittype.entity.LimitTypeCtypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5410.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | climittypebid | 渠道类型明细 | climittypebid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 信用控制域 | pk_org | varchar(20) |  | 组织_信用控制域 (creditctlregion) |
| 3 | cchanneltypeid | 渠道类型 | cchanneltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |