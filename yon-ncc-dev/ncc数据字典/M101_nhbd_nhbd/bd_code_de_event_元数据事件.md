# |<<

**元数据事件 (bd_code_de_event / com.yonyou.yh.nhis.bd.code.vo.CodeDeEventVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/400.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deevent | 事件主键 | pk_deevent | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_de | 数据元 | pk_de | varchar(20) |  | 字符串 (String) |
| 5 | func_act | 启动URL（相对地址） | func_act | varchar(4000) |  | 字符串 (String) |
| 6 | func_act_argu | 启动参数 | func_act_argu | varchar(4000) |  | 字符串 (String) |
| 7 | width_px | 视窗宽度(像素) | width_px | int |  | 整数 (Integer) |
| 8 | height_px | 视窗高度（像素） | height_px | int |  | 整数 (Integer) |
| 9 | esc | 事件描述 | esc | varchar(4000) |  | 字符串 (String) |
| 10 | pk_emrtemp | 级联子模板 | pk_emrtemp | varchar(20) |  | 医疗记录模板 (emrtemplate) |
| 11 | eu_type | 事件类型 | eu_type | int |  | 事件类型 (eu_type) |  | 0=弹出外部窗口; |