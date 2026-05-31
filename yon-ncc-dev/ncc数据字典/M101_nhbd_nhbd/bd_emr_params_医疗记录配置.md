# |<<

**医疗记录配置 (bd_emr_params / com.yonyou.yh.nhis.bd.emr.vo.EMRParamsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/820.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdemrparams | 医疗记录配置主键 | pk_bdemrparams | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_dept | 所属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 5 | flag_global | 是否全局 | flag_global | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | code_param | 编码 | code_param | varchar(50) |  | 字符串 (String) |
| 7 | val_param | 名称 | val_param | varchar(100) |  | 字符串 (String) |
| 8 | desc_param | 描述 | desc_param | varchar(256) |  | 字符串 (String) |