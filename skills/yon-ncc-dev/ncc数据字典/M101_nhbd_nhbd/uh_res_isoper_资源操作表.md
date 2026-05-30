# |<<

**资源操作表 (uh_res_isoper / com.yonyou.yh.nhis.bd.resisoper.vo.ResisoperVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6251.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resisoper | 主键 | pk_resisoper | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | resid | 被操作资源 | resid | varchar(50) |  | 字符串 (String) |
| 5 | operid | 主操作资源 | operid | varchar(50) |  | 字符串 (String) |
| 6 | opertype | 操作类型 | opertype | int |  | 资源操作类型枚举 (ResisoperEnum) |  | 1=患者被医生操作; |