# |<<

**归集数据核算要素 (me_billelement / nc.vo.me.collectorder.entity.BillElement)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3605.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billelement | 归集数据核算要素 | pk_billelement | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | csrcid | 来源表单id | csrcid | varchar(20) |  | 字符串 (String) |
| 5 | csrcbid | 来源行id | csrcbid | varchar(20) |  | 字符串 (String) |
| 6 | fsrctypeflag | 来源单类型 | fsrctypeflag | int |  | 来源类型 (srctypeflag) |  | 1=返利结算; |