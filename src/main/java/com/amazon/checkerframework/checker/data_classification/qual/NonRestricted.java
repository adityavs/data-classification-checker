// Copyright 2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0
package com.amazon.checkerframework.checker.data_classification.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Used to indicate that the annotated element
 * could contain/accept data of any classification
 * level below {@link Restricted}. This means that
 * the annotated element could contain/accept Highly
 * Confidential, Confidential, or Public data.
 *
 * Synonym for {@link HighlyConfidential}, with the same
 * semantics.
 */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface NonRestricted { }
