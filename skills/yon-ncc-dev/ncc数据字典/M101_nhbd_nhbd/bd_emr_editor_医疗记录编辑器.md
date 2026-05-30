# |<<

**医疗记录编辑器 (bd_emr_editor / com.yonyou.yh.nhis.bd.emr.vo.EMREditorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/819.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_editor | 医疗记录编辑器主键 | pk_editor | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | eu_editor | 编辑器类型 | eu_editor | int |  | 医疗记录编辑器类型 (EMREditorEnum) |  | 0=本系统病历书写器(WORD模式); |