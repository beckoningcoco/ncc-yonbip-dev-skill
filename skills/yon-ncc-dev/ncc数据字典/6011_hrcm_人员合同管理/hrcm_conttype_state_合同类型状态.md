# |<<

**合同类型状态 (hrcm_conttype_state / nc.vo.hrcm.make.ConttypeStateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2709.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_conttype_state | 主键 | pk_conttype_state | char(20) | √ | 主键 (UFID) |
| 2 | pk_psndoc | 人员基本档案主键 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 3 | pk_psnorg | 人员组织关系主键 | pk_psnorg | char(20) |  | 主键 (UFID) |
| 4 | assgid | 人员任职ID | assgid | int |  | 整数 (Integer) |
| 5 | conttype | 合同类型 | conttype | char(20) |  | 主键 (UFID) |
| 6 | contstate | 合同类型状态 | contstate | int |  | 合同状态 (ContState) |  | 1=未签订; |