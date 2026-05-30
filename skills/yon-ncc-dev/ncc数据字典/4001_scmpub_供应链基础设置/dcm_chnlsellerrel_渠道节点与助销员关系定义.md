# |<<

**渠道节点与助销员关系定义 (dcm_chnlsellerrel / nc.vo.scmf.dcm.chnlsellerrel.entity.ChnlSellerRelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1693.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_channlsellerrel | 渠道节点与助销员关系定义 | pk_channlsellerrel | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | cchannelnodeid | 渠道节点 | cchannelnodeid | varchar(20) |  | 分销渠道节点主实体 (dcm_chnlnode) |
| 5 | chelpsellerid | 助销员 | chelpsellerid | varchar(20) |  | 助销员 (dcm_helpseller) |
| 6 | cportaluserid | 用户 | cportaluserid | varchar(20) |  | 用户 (user) |
| 7 | fstatusflag | 关系状态 | fstatusflag | int |  | 助销员关系状态 (sellerstatusflag) |  | 0=正常; |