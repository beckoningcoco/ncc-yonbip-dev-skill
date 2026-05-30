# |<<

**营销活动 (cabd_campaign / nc.vo.cabd.mkma.mkmacampaign.mkmacampaign.CampaignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1264.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_campaign | 营销活动主键 | pk_campaign | char(20) | √ | 主键 (UFID) |
| 2 | vcode | 编码 | vcode | varchar(50) |  | 字符串 (String) |
| 3 | vname | 活动名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 6 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |