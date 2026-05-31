# |<<

**自定义服务项目明细 (bd_uh_srvudcate_cont_item / nc.vo.nhbd.srv.SrvUDCateContItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1137.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_udcateitem | 项目明细主键 | pk_udcateitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | flag_cateitem | 归属类别 | flag_cateitem | varchar(50) | √ | 归属类别 (SrvContItemTypeEnum) |  | 0=服务分类; |