# |<<

**外部数据源 (wa_otherdatasource / nc.vo.wa.othersource.OtherSourceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6337.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_otherdatasource | 主键 | pk_otherdatasource | char(20) | √ | 主键 (UFID) |
| 2 | datasourcename | 项目名称 | datasourcename | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | formulastr | 项目定义 | formulastr | varchar(2000) | √ | 备注 (Memo) |
| 4 | datatype | 项目类型 | datatype | int | √ | 数据类型 (typeenum) |  | 0=数值型; |