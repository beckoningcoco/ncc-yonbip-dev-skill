# |<<

**额度类型表 (so_limittype / nc.vo.credit.limittype.entity.LimitTypeHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5408.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | climittypeid | 额度类型 | climittypeid | char(20) | √ | 主键 (UFID) |
| 2 | vlimittypecode | 额度类型编码 | vlimittypecode | varchar(30) |  | 字符串 (String) |
| 3 | vlimittypename | 额度类型名称 | vlimittypename | varchar(30) |  | 多语文本 (MultiLangText) |
| 4 | pk_org | 信用控制域 | pk_org | varchar(20) |  | 组织_信用控制域 (creditctlregion) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | fvoccupiedflag | 占用时点 | fvoccupiedflag | int |  | 信用占用开始时点 (fvoccupiedflag) |  | 0=订单保存; |