# |<<

**临床业务日期分组 (bd_uh_cnslot / com.yonyou.yh.nhis.bd.code.vo.BdCnSlotVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1019.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnslot | 期间主键 | pk_cnslot | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | eu_cnslottype | 临床业务类型 | eu_cnslottype | int |  | 临床业务类型 (CnSlotTypeEnum) |  | 0=生命体征; |