# |<<

**代缴代扣档案 (bm_replacedoc / nccloud.dto.hrbm.replacedoc.ReplacedocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1233.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_replacedoc | 主键 | pk_replacedoc | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_replaced | 被代理人 | pk_replaced | varchar(20) |  | 工作记录 (hi_psnjob) |
| 5 | pk_replacer | 代理人 | pk_replacer | varchar(20) |  | 工作记录 (hi_psnjob) |
| 6 | pk_bm_class | 代扣险种 | pk_bm_class | varchar(20) |  | 险种 (bmclass) |
| 7 | replacetype | 代扣类型 | replacetype | int |  | 成分类型 (BMComponent) |  | 1=个人部分; |