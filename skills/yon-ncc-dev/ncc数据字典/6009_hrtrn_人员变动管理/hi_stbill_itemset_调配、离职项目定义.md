# |<<

**调配、离职项目定义 (hi_stbill_itemset / nc.vo.trn.transitem.TrnTransItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2606.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stbill_itemset | 调配/离职项目主键 | pk_stbill_itemset | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 4 | itemkey | 项目键值 | itemkey | varchar(50) |  | 字符串 (String) |
| 5 | itemname | 项目显示名称 | itemname | varchar(100) |  | 字符串 (String) |
| 6 | disorder | 显示顺序 | disorder | int |  | 整数 (Integer) |
| 7 | pk_sttype | 调配/离职类型 | pk_sttype | char(20) |  | 主键 (UFID) |
| 8 | billtype | 单据类型 | billtype | varchar(50) | √ | 单据类型 (enum) |  | BJ=调配; |