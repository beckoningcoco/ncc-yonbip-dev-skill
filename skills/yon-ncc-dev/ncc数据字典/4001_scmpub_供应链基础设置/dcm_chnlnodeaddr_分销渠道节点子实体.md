# |<<

**分销渠道节点子实体 (dcm_chnlnodeaddr / nc.vo.scmf.dcm.chnlnode.entity.ChnlNodeAddrBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1692.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_channeladdr | 分销渠道节点收货地址主键 | pk_channeladdr | char(20) | √ | 主键 (UFID) |
| 2 | ccustmaddrid | 对应客户收货地址 | ccustmaddrid | varchar(20) |  | 客户收货地址 (custaddress) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |